/*
Template

per il template puoi fare un esercizio creando una classe astratta AbstractPanino, che ha 4 metodi

sono tutti metodi che stampano un messaggio

1) tagliaPanino(){ system.out.println("taglia il pane") }

2) mettiCondimento(); da implementare

3) mettiSalsa() da implementare

4) consegnaPanino(){ system.out.println("consegnato il panino") }

hai tipo due classi concrete, PaninoA e PaninoB, che implementano l'interfaccia, cioe' i metodi mettiCondimento e mettiSalsa

ah gia', tutti i quattro metodi, nell'interfaccia, devono essere richiamata dentro un metodo final, per esempio preparaPanino(){i quattro metodi}

in pratica devi creare degli oggetti che fanno la stessa cosa, ma ognuno lo fanno in un modo un po' diverso;
 */

public class EsercizioTemplate {

	public static void main(String[] args) {
		HotDog hd = new HotDog();
		hd.preparaPanino();
		
		PaninoProsciutto pp = new PaninoProsciutto();
		pp.preparaPanino();
		
	}

}
