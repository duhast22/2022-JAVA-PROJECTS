
class UpperCaseTransformer implements MyTransformer<String> {

	@Override
	public String transformElement(String s) {
		return s.toUpperCase();
	}

}

class AddThree implements MyTransformer<Integer> {
	
	@Override
	public Integer transformElement(Integer num) {
		return num+3;
	} 
	
}

class ConcatTheWordHIPPOPOTAMUS implements MyTransformer<String> {
	
	@Override
	public String transformElement(String s) {
		return s.concat(" HIPPOPOTAMUS");
	} 
	
}