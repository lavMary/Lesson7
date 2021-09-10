public class PriestAcademy extends Academy{
    public void teach(Trainee trainee) {
        if (trainee instanceof Healer) {
            super.teach(trainee);
            //return;
        }
        else {
            System.out.println("");
        }
    }
}
