
public class GlavniP {

	public static void main(String[] args) {
		ExcelUtils.setExcell("Data (DOM).xls");
		ExcelUtils.setWorkSheet(0);
		System.out.println(ExcelUtils.getIntDataAt(0, 0));
		ExcelUtils.setDataAt(0, 1, "25");
		ExcelUtils.closeExcell();
	}

}
