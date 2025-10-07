package tema2;

import java.util.Scanner;

public class EjercicioIf2 {
    public static void main(String[] args) {
        //EJERCICIO PARA DETERMINAR SI TE DAN UNA BECA Y DE QUÉ TIPO
        //Requisitos generales (deben cumplirse los dos):
        //1. No tener más de dos asignaturas suspensas
        //2. Ingresos familiares inferiores a 2000€/mes
        //Si se cumplen te van a dar un tipo de beca
        //BECA COMPLETA: si se cumple alguna de estas condiciones (or)
        //1. Ingresos inferiores a 800€/mes
        //2. Vives en zona vulnerable
        //3. Discapacidad superior al 60%
        //BECA PARCIAL: si se cumple alguna de estas condiciones (or)
        //1. Ingresos inferiores a 1000€/mes y Familia numerosa
        //2. Ingresos inferiores a 1200€/mes
        //3. Ingresos inferiores a 1100€/mes y vives en zona vulnerable
        //4. Discapacidad entre el 40 y 60%
        //BECA SIMPLE: si se cumple alguna de estas condiciones (or)
        //1. Ingresos familiares entre 1400€/mes y 1800€/mes
        //2. Discapacidad entre el 20 y 40%

        //V.E.: ingresosMensualesFamilia, asignaturasSuspensas, zonaVulnerable,
        //      discapacidad(0-100), familiaNumerosa
        //V.S.: si te dan beca o no, y en caso afirmativo qué tipo de beca


        //تمرين لتحديد ما إذا كنت ستحصل على منحة دراسية ونوع المنحة الدراسية
//المتطلبات العامة (يجب استيفاء كلا الشرطين):
//1. ألا يكون قد رسب في أكثر من مادتين دراسيتين
//2. دخل الأسرة أقل من 2000 يورو شهريًا
//في حال استيفاء هذه الشروط، ستحصل على نوع من المنح الدراسية
//منحة دراسية كاملة: في حال استيفاء أي من هذه الشروط (أو)
//1. دخل أقل من 800 يورو شهريًا
//2. سكنك في منطقة معرضة للخطر
//3. إعاقة تزيد عن 60%
//منحة دراسية جزئية: في حال استيفاء أي من هذه الشروط (أو)
//1. دخل أقل من 1000 يورو شهريًا وعائلة كبيرة
//2. دخل أقل من 1200 يورو شهريًا
//3. دخل أقل من 1100 يورو شهريًا، وتقيم في منطقة معرضة للخطر.
//4. إعاقة بنسبة تتراوح بين 40 و60%.
//منحة بسيطة: في حال استيفاء أي من هذه الشروط (أو):
//1. دخل الأسرة بين 1400 و1800 يورو شهريًا.
//2. إعاقة بنسبة تتراوح بين 20 و40%.

//V.E.: دخل الأسرة الشهري، مواد الرسوب، منطقة معرضة للخطر.
// إعاقة (0-100)، عائلة كبيرة.
//V.S.: ما إذا كنت قد حصلت على منحة أم لا، وإذا كان الأمر كذلك، فما نوع المنحة؟
//V.E.: ingresosMensualesFamilia, asignaturasSuspensas, zonaVulnerable,
        //      discapacidad(0-100), familiaNumerosa
        //V.S.: si te dan beca o no, y en caso afirmativo qué tipo de beca


        int ingresosMensualesFamilia, asignaturasSuspensas, discapacidad;
        boolean zonaVulnerable,familiaNumerosa;


        Scanner sc = new Scanner(System.in);

        System.out.println("Dime cuántas asignaturas suspensas: ");
        asignaturasSuspensas = sc.nextInt();


        sc = new Scanner(System.in);
        System.out.println("Dime sus Ingresos familiares: ");
        ingresosMensualesFamilia = sc.nextInt();

        sc = new Scanner(System.in);
        System.out.println("Dime su discapacidad entre el 0 y 100%: ");
        discapacidad = sc.nextInt();


        sc = new Scanner(System.in);
        System.out.println("tu vives en zona vulnerable : ");
        zonaVulnerable = sc.nextBoolean();

        sc = new Scanner(System.in);
        System.out.println("tu familia numerosa : ");
        familiaNumerosa = sc.nextBoolean();



        if (asignaturasSuspensas < 3 && ingresosMensualesFamilia < 2000)
        {
            if (ingresosMensualesFamilia < 800 || zonaVulnerable || discapacidad > 60) {
                System.out.println("BECA COMPLETA");

            } else if ( (ingresosMensualesFamilia < 1000 && familiaNumerosa)
                    || ingresosMensualesFamilia < 1200
                    || (ingresosMensualesFamilia < 1100 && zonaVulnerable)
                    || (discapacidad <= 40 && discapacidad >= 60)
            ) {

                System.out.println("BECA PARCIAL");

            } else if ((ingresosMensualesFamilia >= 1400 && ingresosMensualesFamilia <= 1800)
                    || (discapacidad >= 20 && discapacidad < 40)) {

                System.out.println("BECA SIMPLE");
            } else {
                System.out.println("lo sentemos");
            }

        } else {
            System.out.println("lo sentemos");

        }

    }
}
