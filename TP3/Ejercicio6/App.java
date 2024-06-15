import modelos.Empleado;
import Inputs.MenuInput;
import modelos.BaseEmpleados;

public class App{

    public static void main(String[] args){
        BaseEmpleados empleados = new BaseEmpleados();
        MenuInput menu = new MenuInput();
        menu.menu(empleados);

    }
}