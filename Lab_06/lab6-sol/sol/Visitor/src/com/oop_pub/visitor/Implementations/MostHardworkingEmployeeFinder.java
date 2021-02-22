package com.oop_pub.visitor.Implementations;

import com.oop_pub.visitor.Visitor;

/**
 * Implementations for finding if the average number of extra hours for bosses is higher
 * than the one for employees.
 * Interns are not taken into consideration.
 */
public class MostHardworkingEmployeeFinder implements Visitor {

    private int numEmp;
    private int numBoss;
    private float sumEmpHours;
    private float sumBossHours;

    @Override
    public void visit(Employee e) {
        sumEmpHours += e.getExtraHours();
        numEmp++;
    }

    @Override
    public void visit(Boss b) {
        sumBossHours += b.getExtraHours();
        numBoss++;
    }

    @Override
    public void visit(Intern intern) {
        //do nothing, we don't count interns' extra hours
    }

    public boolean isBossHardWorking() {
        //System.out.format ("emphours = %d, numEmp = %d, "
        //					+ "bossHours = %d, numBoss = %d\n",
        //					sumEmpHours, numEmp, sumBossHours, numBoss);

        return sumEmpHours / numEmp < sumBossHours / numBoss;
    }
}
