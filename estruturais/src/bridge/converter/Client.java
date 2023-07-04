package bridge.converter;

import bridge.converter.converters.CSVConverter;
import bridge.converter.converters.JsonConverter;
import bridge.converter.employees.ITGuy;
import bridge.converter.employees.ProjectManager;

public class Client {

    public static void main(String[] args) {
        JsonConverter jsonConverter = new JsonConverter();
        CSVConverter csvConverter = new CSVConverter();

        ITGuy itGuy = new ITGuy("Felipe", 21, 8500.00);
        ProjectManager projectManager = new ProjectManager("Pedro", 40, 15000.00);

        System.out.println(jsonConverter.getEmployeeFormatted(itGuy));
        System.out.println(csvConverter.getEmployeeFormatted(itGuy));
        System.out.println(jsonConverter.getEmployeeFormatted(projectManager));
        System.out.println(csvConverter.getEmployeeFormatted(projectManager));

    }

}
