package p01_연습.ForHost;

public class DefaltProduct {
	public Product[] burgerKingDefaultTable() {
		Product[] menu = new Product[5];
		
		menu[0] = new Product("블랙 어니언 와퍼", 10300);
		menu[1] = new Product("기네스콰트로치즈와퍼", 10200);
		menu[2] = new Product("몬스터와퍼", 10200);
		menu[3] = new Product("통새우와퍼", 8600);
		menu[4] = new Product("스태커 2 와퍼", 10400);
		
		return menu;
	}
	
	public Product[] McdonaldDefaultTable() {
		Product[] menu = new Product[5];
		
		menu[0] = new Product("빅맥", 5700);
		menu[1] = new Product("맥크리스피", 7500);
		menu[2] = new Product("치즈버거", 3300);
		menu[3] = new Product("쿼터파운더치즈", 6300);
		menu[4] = new Product("베이컨 토마토디럭스", 6600);
		
		return menu;
	}



}
