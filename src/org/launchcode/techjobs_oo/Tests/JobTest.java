package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.junit.Before;
import static   org.junit.Assert.*;
import junit.framework.TestCase.*;



public class JobTest {

//    @Before
//    public void createJobTestObject() {
//        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    }

    @Test
    public void testSetJobId() {
        Job test_job_Id = new Job();
        Job test_job_Id1 = new Job();
//        return System.out.println(test_job_Id);
//        assertEquals(test_job_Id.getId(),
//                test_job_Id1.getId());

        assertNotEquals(test_job_Id.getId(),
                test_job_Id1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job instanceof Job);
        assertTrue(new Employer("ACME") instanceof Employer);
        assertTrue(new Location("Desert") instanceof Location);
        assertTrue(new PositionType("Quality control") instanceof PositionType);
        assertTrue(new CoreCompetency("persistence") instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job id_test1 = new Job("Coder", new Employer("LaunchCode"), new Location("Delmar"), new PositionType("School"), new CoreCompetency("GetJob"));
        Job id_test2 = new Job("Coder", new Employer("LaunchCode"), new Location("Delmar"), new PositionType("School"), new CoreCompetency("GetJob"));

        assertNotEquals(id_test1.getId(),
                id_test2.getId());
    }

    @Test
    public void testToString() {
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job1.toString().contains("\n");
    }

    @Test
    public void secondTestToString() {
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job1.toString().contains("id: " + "\n");
        test_job1.toString().contains("name: " + "Product Tester" + "\n");
        test_job1.toString().contains("employer: " + "ACME" + "\n");
        test_job1.toString().contains("location: " + "Desert" + "\n");
    }

    @Test
    public void thirdTestToString(){
        Job test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job1.toString().contains("Name: Data Not Available");
        test_job1.toString().contains("Employer: Data Not Available");
        test_job1.toString().contains("Location: Data Not Available");
        test_job1.toString().contains("Position Type: Data Not Available");
        test_job1.toString().contains("CoreCompetency: Data Not Available");


    }


}