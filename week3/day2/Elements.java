package week3.day2;

public class Elements extends Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Elements ele=new Elements();
		ele.click();
	    ele.setText("WebElement is the Text");
		System.out.println();
		ele.submit();
		
		CheckBoxButton cbut=new CheckBoxButton();
		cbut.clickCheckButton();
		
		RadioButton rbut=new RadioButton();
		rbut.selectRadioButton();
		
		TextField tField =new TextField();
		tField.getText();
				
	}

}
