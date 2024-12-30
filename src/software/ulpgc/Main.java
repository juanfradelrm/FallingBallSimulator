package software.ulpgc;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        BallPresenter presenter = new BallPresenter( mainFrame.getBallDisplay(), new BallSimulator( 0.001))
                .add(new Ball("1",-10, 0.8, 25, 0, -9.8, 0.8))
                .add(new Ball("2",0,0.8, 25, 0, -1.625, 0.5))
                .add(new Ball("3",10,0.8, 1, 0, -24.79, 10));
        presenter.execute();
        mainFrame.setVisible(true);
    }
}
