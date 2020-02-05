package factory;

class TvKoujyou extends Koujyou{
	public Seihin factoryMethod() {
		return new Television();
	}
	public void touroku(Seihin s) {
		Television t = (Television) s;
		t.numberring();		//製造番号を呼び出す
		t.setDate(Date.today());	//製造年月日を呼び出す
	}
}
