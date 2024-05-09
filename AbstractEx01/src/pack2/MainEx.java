package pack2;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		f.move(0, 0);
		f.attack();
		
		//
		Fightable ft = new Fighter();
		ft.move(0, 0);
		ft.attack();

		Movable m = new Fighter();
		m.move(0, 0);
		
		Attackable a = new Fighter();
		a.attack();
	}

}
