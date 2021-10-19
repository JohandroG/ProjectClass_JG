public class ProyectTest {
    public static void main(String[] args) {
        
        Project newpro = new Project("Small proyect","This is the description");
        Project newpro2 = new Project();

        
        newpro.print();
        newpro.elevatorPitch();
        
        newpro2.print();
        newpro2.elevatorPitch();


    }
}
