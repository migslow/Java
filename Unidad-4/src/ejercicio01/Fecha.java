package ejercicio01;

public class Fecha {
	private int _dia, _mes, _anio;

	public Fecha() {
		_dia = 1;
		_mes = 1;
		_anio = 1900;
	}

	public Fecha(int d, int m, int a) {
		_dia = d;
		_mes = m;
		_anio = a;
		valida();
	}

	public String toString() {
		return (_dia + "/" + _mes + "/" + _anio);
	}

	public void leer() {
		System.out.print("Dia: ");
		_dia = MyInput.readInt();
		System.out.print("Mes: ");
		_mes = MyInput.readInt();
		System.out.print("Anho: ");
		_anio = MyInput.readInt();
		valida();
	}

	public boolean bisiesto() {
		return (_anio % 4) == 0;
	}

	public int diasMes(int mes) {
		int numeroDias;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numeroDias = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numeroDias = 30;
			break;
		default:
			if (bisiesto())
				numeroDias = 29;
			else
				numeroDias = 28;
		}
		return numeroDias;
	}

	public int dia() {
		return _dia;
	}

	public int mes() {
		return _mes;
	}

	public int anio() {
		return _anio;
	}

	public void dia(int d) {
		_dia = d;
		valida();
	}

	public void mes(int m) {
		_mes = m;
		valida();
	}

	public void anio(int a) {
		_anio = a;
		valida();
	}

	public void corta() {
		if (_dia < 10)
			System.out.print("0");
		System.out.print(_dia + "-");
		if (_mes < 10)
			System.out.print("0");
		System.out.print(_mes + "-" + _anio);
	}

	public long diasTranscurridos() {
		long total;
		int anios, m, bisiestos = 0;
		anios = _anio - 1900;
		total = anios * 365;
		bisiestos = (anios + 3) / 4;
		total += bisiestos;
		for (m = 1; m < _mes; m++)
			total += diasMes(m);
		total += _dia;
		total--;
		return total;
	}

	public int diaSemana() {
		int nd = (int) (diasTranscurridos() % 7);
		return nd;
	}

	public void larga() {
		int ds = diaSemana();
		switch (ds) {
		case 1:
			System.out.print("lunes");
			break;
		case 2:
			System.out.print("martes");
			break;
		case 3:
			System.out.print("miercoles");
			break;
		case 4:
			System.out.print("jueves");
			break;
		case 5:
			System.out.print("viernes");
			break;
		case 6:
			System.out.print("sabado");
			break;
		default:
			System.out.print("domingo");
		}
		System.out.print(" " + _dia + " de ");
		switch (_mes) {
		case 1:
			System.out.print("enero");
			break;
		case 2:
			System.out.print("febrero");
			break;
		case 3:
			System.out.print("marzo");
			break;
		case 4:
			System.out.print("abril");
			break;
		case 5:
			System.out.print("mayo");
			break;
		case 6:
			System.out.print("junio");
			break;
		case 7:
			System.out.print("julio");
			break;
		case 8:
			System.out.print("agosto");
			break;
		case 9:
			System.out.print("septiembre");
			break;
		case 10:
			System.out.print("octubre");
			break;
		case 11:
			System.out.print("noviembre");
			break;
		case 12:
			System.out.print("diciembre");
			break;
		}
		System.out.println(" de " + _anio);
	}

	public void fechaTras(long dias) {
		int diasAnio, diasMes;
		if (dias < 0)
			return;
		_dia = 1;
		_mes = 1;
		_anio = 1900;
		while (dias > 0) {
			if (bisiesto())
				diasAnio = 366;
			else
				diasAnio = 365;
			if (dias >= diasAnio) {
				dias -= diasAnio;
				_anio++;
				if (_anio == 2051) {
					_dia = 31;
					_mes = 12;
					_anio = 2050;
					return;
				}
			} else {
				if (dias >= diasMes(_mes)) {
					dias -= diasMes(_mes);
					_mes++;
				} else {
					_dia += dias;
					dias = 0;
				}
			}
		}
	}

	public long diasEntre(Fecha otra) {
		long dias = diasTranscurridos() - otra.diasTranscurridos();
		return Math.abs(dias);
	}

	public void siguiente() {
		long dias = diasTranscurridos();
		fechaTras(dias + 1);
	}

	public void anterior() {
		long dias = diasTranscurridos();
		fechaTras(dias - 1);
	}

	public Fecha copia() {
		Fecha tmp = new Fecha();
		tmp._dia = _dia;
		tmp._mes = _mes;
		tmp._anio = _anio;
		return tmp;
	}

	public boolean menorQue(Fecha f) {
		if (diasTranscurridos() < f.diasTranscurridos())
			return true;
		else
			return false;
	}

	public boolean igualQue(Fecha f) {
		if (diasTranscurridos() == f.diasTranscurridos())
			return true;
		else
			return false;
	}

	public boolean mayorQue(Fecha f) {
		if (diasTranscurridos() > f.diasTranscurridos())
			return true;
		else
			return false;
	}

	private void valida() {
		if ((_anio < 1900) || (_anio > 2050))
			_anio = 1900;
		if ((_mes < 1) || (_mes > 12))
			_mes = 1;
		if (_dia < 1)
			_dia = 1;
		else if (_dia > diasMes(_mes))
			_dia = 1;
	}
}
