public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary > 1000) {
            return (salary * 3) / 100;
            
        }
        return 0;
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;

    }

    public double raiseSalary() {
        if ((2021 - hireYear) < 10) {
            return salary * 0.05;
        }
        if ((2021 - hireYear) > 9 && (2021 - hireYear) < 20) {
            return salary * 0.1;
        }
        if ((2021 - hireYear) > 19) {
            return salary * 0.15;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Adı: " + name + "\nMaaşı: " + salary + "\nÇalışma Saati: " + workHours + "\nBaşlangıç Yılı: " + hireYear
                + "\nVergi: " + tax() + "\nBonus: " + bonus() + "\nMaaş Artışı: " + raiseSalary()
                + "\nVergi ve Bonuslar ile Birlikte Maaş: " + (salary + bonus() - tax())
                + "\nToplam Maaş: "+(salary+raiseSalary());
    }
}