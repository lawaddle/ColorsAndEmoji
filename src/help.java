import java.util.ArrayList;

public class help {

    private final String NEUTRAL = "\uD83D\uDE10";

    public help(){}

    public void colors() throws InterruptedException
    {
        ArrayList<String> colorNorm = new ArrayList<>();
        colorNorm.add(CC.RED);
        colorNorm.add(CC.BLUE);
        colorNorm.add(CC.BLACK);
        colorNorm.add(CC.YELLOW);
        colorNorm.add(CC.CYAN);
        colorNorm.add(CC.PURPLE);
        colorNorm.add(CC.GREEN);
        colorNorm.add(CC.WHITE);

        String space = "";

        for (int i = 0; i < 5; i++) {
            for (String colo: colorNorm) {
                System.out.print(colo);
                System.out.print(space);
                int faces = (int) (Math.random()*(7-1+1)+1);
                for (int j = 0; j < faces; j++) {
                    System.out.print(NEUTRAL);
                }
            }
            space+="  ";
            System.out.println();
            Thread.sleep(250);
        }


    }


}
