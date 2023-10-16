public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYeae;
    int vergi;
    int bonus;
    int maasArtisi;
    Employee(String name , int salary , int workHours , int hireYeae){

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYeae = hireYeae;
    }
    void tax (){
        if(salary >1000){
            vergi = salary *3/100;
        }
    }
    void bonus () {

        if(workHours > 40){
            bonus = (workHours - 40) * 30;
        }
    }
    void raiseSalary(){
        if(2021 - hireYeae < 10 ){
            maasArtisi = salary * 5/100;
        }
        else if (2021 - hireYeae > 9 && 2021 - hireYeae <20){
            maasArtisi = salary *1/10;
        }
        else if (2021 - hireYeae >19){
            maasArtisi = salary * 15/100;
        }
    }
    void Tostring(){
        System.out.println("ADI : " + this.name);
        System.out.println("MAAŞI : " + this.salary);
        System.out.println("ÇALIŞMA SAATİ : " + this.workHours);
        System.out.println("BAŞLANGIC YILI : " + hireYeae);
        System.out.println("VERGİ  :" + this.vergi);
        System.out.println("BONUS : " + this.bonus);
        System.out.println("MAAŞ ARTIŞI : " + maasArtisi);
        System.out.println( "VERGİ VE BONUSLAR İLE BİRLİKTE MAAŞ ARTIŞI : " + ((bonus+ salary)-vergi));
        System.out.println("TOPLAM MAAŞ : " + ((bonus + salary + maasArtisi) -vergi));
    }
}
