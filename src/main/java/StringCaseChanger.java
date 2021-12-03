public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder rs = new StringBuilder();
        String str = drink.getText();
        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                rs.append(Character.toUpperCase(str.charAt(i)));
            }
            else
                rs.append(Character.toLowerCase(str.charAt(i)));
        }
        drink.setText(rs.toString());
    }



}
