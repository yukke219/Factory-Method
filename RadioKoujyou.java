package factory;

class RadioKoujyou extends Koujyou{
	public Seihin factoryMethod() {
		return new Radio();
	}
	public void touroku(Seihin s) {
		Radio r = (Radio) s;
		r.numberring();		//製造番号を呼び出す
	}
}
