import java.util.ArrayList;

public class Panier{

	ArrayList<Orange> listOrange=new ArrayList<Orange>();
	int tailleMax;
	int taille=0;

	public Panier(int t){
		this.tailleMax=t;	
	}
	
	public void setTailleMax(int i){
		this.tailleMax=i;
	}
	
	public void setTaille(int i){
		this.taille=i;
	}
	
	public void setListOrange(Orange o, int i){
		this.listOrange.set(i,o);
	}
	
	public int getTailleMax(){
		return this.tailleMax;	
	}
	
	public int getTaille(){
		return this.taille;	
	}
	
	public Orange getListOrange(int i){
		return listOrange.get(i);	
	}

	public boolean estPlein(){	
		if(getTailleMax()==getTaille())
			return true;
		else
			return false;
	}
	
	public boolean estVide(){
		if(getTaille()==0)
			return true;
		else
			return false;
	}
	
	public boolean ajoute(Orange o){
		if(!estPlein()){
			this.listOrange.add(o);
			setTaille(getTaille()+1);
			return true;
		}
		else{
			System.out.println("panier plein");
			return false;	
		}
			
	}
	
	public static void main( String[] args){
		
		Orange o=new Orange(4,"Paris");
		Orange o1=new Orange(1, "Montcul");
		Orange o2=new Orange(0.01, "URSS");
		Orange o3=new Orange(1000, "Pluton");
		
		Panier p=new Panier(2);
		Panier p1=new Panier(4);
		
		p.ajoute(o);
		p.ajoute(o2);
		p.ajoute(o1);
		
		p1.ajoute(o2);
		p1.ajoute(o2);
		p1.ajoute(o2);
		
		System.out.println(p.getListOrange(0).getOrigine());
		
		System.out.println(p1.getListOrange(1).getOrigine());
		
		p1.setListOrange(o3,1);
		
		System.out.println(p1.getListOrange(1).getOrigine());
			
	
	}

}