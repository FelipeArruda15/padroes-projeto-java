package bridge.converter.converters;

import bridge.converter.employees.Employee;

public class JsonConverter implements Converter {

    @Override
    public String getEmployeeFormatted(Employee employee) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n")
                .append("\t\"name\": \"")
                .append(employee.getName())
                .append("\",\n")
                .append("\t\"age\": \"")
                .append(employee.getAge())
                .append("\",\n")
                .append("\t\"salary\": \"")
                .append(employee.getSalary())
                .append("\"\n")
                .append("}");

        return sb.toString();
    }

}
