package factory;

class Counter {
	private static int tvNum = 100;	//テレビの初期製造番号
	private static int radioNum = 76;	//ラジオの初期製造番号

	public static int getTvNumber() {
		return tvNum++;
	}

	public static int getRadioNumber() {
		return radioNum++;
	}
}
