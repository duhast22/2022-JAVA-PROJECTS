class LongWordChooser implements MyChooser<String> {

	@Override
	public boolean chooseElement(String s) {
		return (s.length() > 5);
	}

} 

class EvenNumberChooser implements MyChooser<Integer> {
	
	@Override
	public boolean chooseElement(Integer num) {
		return (num % 2 == 0);
	}
	
}

class StringStartsWithS implements MyChooser<String> {
	
	@Override
	public boolean chooseElement(String s) {
		return s.startsWith("S");
	}
}