public class Strategy implements Glue {
    private Glue glue;
    public Strategy(Glue glue) {
        this.glue = glue;
    }

    public void Show(){
        this.glue.Show();
    }


    public void ShowGlueName() {
        this.glue.ShowGlueName();
    }
}
