package factory;

public class Client {

	public static void main(String[] args) {
		Koujyou koujyou1 = new TvKoujyou();	//テレビ工場を参照する変数
		Koujyou koujyou2 = new RadioKoujyou();		//ラジオ工場を参照する変数

		Seihin[] array = new Seihin[3];
		array[0] = koujyou1.create();
		array[1] = koujyou2.create();
		array[2] = koujyou1.create();

		for(int i = 0;i < array.length;++i) {
			array[i].print();
		}

	}

}
