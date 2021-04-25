// Ejercicio 13 del boletín 1: Ejercicio de examen.

{
	final double MBALA=20.0;
	final float G=9.8f;
	final int V0=30;
}


public class Ej13 {
	public static void main(String [] args) {
		// Constantes.
		final double MBALA=20.0;
		final float G=9.8f;
		final int V0=30;

		// Variables.
		int ang=30;
		int h,tA,d,f;
		double aRad;
		boolean barcoHundido,cañonRoto;

		// Fórmulas.
		aRad=ang*Math.PI/180;

		d=(int)(V0*V0*Math.sin(2*aRad)/(2*G));
		h=(int)(d*Math.tan(aRad)-G/(2*V0*V0*Math.cos(aRad)*Math.cos(aRad))*d*d);
		tA=(int)(V0*Math.sin(aRad)/G);
		f=(int)(MBALA*V0/tA);

		// Predicados.
		barcoHundido=!(d<500 || d>700) || ang==45 && ang!=45;		
		// Ley Morgan
		barcoHundido=!(!(d>=500)) && !(d>700) || ang==45 && ang!=45;
		// Ley Involución.
		barcoHundido=d>=500 && d<=700 || ang==45 && ang!=45;
		// Ley Elemento simétrico.
		barcoHundido=d>=500 && d<=700 || false;
		// Ley Elemento neutro.
		barcoHundido=d>=500 && d<=700;




	}
}
