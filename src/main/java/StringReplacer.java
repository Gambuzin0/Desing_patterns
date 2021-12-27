public class StringReplacer implements StringTransformer {
    private Character old, nw;

    public StringReplacer(Character old, Character nw){
        this.old = old;
        this.nw = nw;
    }

    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(old,nw));
    }

    @Override
    public void undo(StringDrink drink) {
        drink.setText(drink.getText().replace(nw,old));
    }
}
