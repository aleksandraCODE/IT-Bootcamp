package cetvrtaned;

public class Zadatak_1_08132019 {

	public static void main(String[] args) {
		int x = 35;
		int y = ++x;
		/*
		 * Ovo je preincrement, pri cemu se prvo povecava vrednost *x* za 1-nova
		 * vrednost *x*=36, a zatim se ta nova vrednost dodeljuje u *y*. Posle promena
		 * *x* ce biti 36, takodje i *y*.
		 */

		int c = 5;
		int d = 10 - ++c;
		/*
		 * Ovo je preincrement, pri cemu se prvo povecava vrednost *c* za 1-nova
		 * vrednost *c*=6, zatim se ta vrednost dodeljuje u *d*. Nakon toga se od 10
		 * oduzima ta vrednost 6 i time dobija rezultat *d*=4.
		 * 
		 */

		int a = 5;
		int b = 10 + a++;
		/*
		 * Ovo je postincrement, pri cemu se prvo dodeljuje vrednost *a* u *b* (5) , a
		 * zatim se sabira sa 10 i vrednost *b* ce biti 15. Posle promena, nova vrednost
		 * *a* ce biti 6.
		 * 
		 */

		int e = 4;
		int f = 9 / --e;
		/*
		 * Ovo je predecrement pri cemu se prvo oduzima trenutna vrednost *e* za 1 -nova
		 * vrednost je 3, a zatim se ta nova vrednost dodeljuje u *f*. Nakon toga se
		 * vracamo na *f* gde se 9 deli sa tom vrednoscu 3, pri cemu se dobija rezultat
		 * *f*=3.
		 */
		int g = 12;
		int h = 8 + g--;
		/*
		 * Ovo je postdecrement, pri cemu se prvo dodeljuje trenutna vrednost *g* u
		 * *h*(12), a zatim se ta vrednost oduzima za 1 (g ce imatu vrednost *11*).
		 * Nakon toga se u *h* nastavlja racunanje, pri cemu se 8 sabira sa 12 i njegova
		 * krajnja vrednost ce biti 20.
		 */

		/* Kombinacije decrement^increment */
		int i = 5;
		int j = 21;
		int k = ++i * 7 + 2 - j--;
		/*
		 * Prvo se radi preincrement *i*, pri cemi se prvo povecava vrednost *i* za
		 * 1(6), a zatim se ta vrednost dodeljuje u *k*. Imamo postdecrement *j*, pri
		 * cemu prvo dodeljujemo vrednost u *k* (21), a zatim oduzimamo vrednost *j* za
		 * 1(20). Vracamo se na *k*, gde sada imamo 6*7+2-21 , sto ce biti 44-21, tj.23.
		 */
		/*
		 * 
		 */
		int l = 10;
		int m = 5;
		int o = --l - m++;
		/*
		 * Radimo predecrement,pri cemu se prvo smanjuje vrednost *l* za 1(9), a zatim
		 * se ta nova vrednost dodeljuje u *o*. Radimo postincrement *m*, pri cemu prvo
		 * povecavamo vrednost *m* za 1(6), i tu novu vrednost dodeljujemo u *o*.
		 * Vracamo se na *o* i racunamo dalje(9-6), gde dobijamo krajnju vrednost *o*=3.
		 * 
		 */
	}
}