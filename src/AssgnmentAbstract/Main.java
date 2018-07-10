package AssgnmentAbstract;

public class Main {
	public static void main(String[] args) {
		Employee nVNormal1  = new NormalEmployee("Khoa","Hue",255443);
		Employee nVNormal2  = new NormalEmployee("Huy","Dong Thap",242223);
		Employee nVBonus1  = new BonusEmployee("Hoang","Hue",23344,3266);
		System.out.println(nVNormal1.toString());
		System.out.println(nVNormal2.toString());
		System.out.println(nVBonus1.toString());
	}
}
