/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.TestingCenter;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author swathisharma
 */
public class TestingCenterDirectory {
    private ArrayList<TestingCenter> TestingCenterList;
   
    private TestingCenter testingCenter;

    public TestingCenterDirectory() {
        TestingCenterList = new ArrayList<TestingCenter>();
    }

    public ArrayList<TestingCenter> gettestingCenterList() {
        return TestingCenterList;
    }

    public void settestingCenterList(ArrayList<TestingCenter> testingCenterList) {
        this.TestingCenterList = testingCenterList;
    }

    public TestingCenter getTestingCenterDirectory() {
        return testingCenter;
    }

    public void setTestingCenterListMan(TestingCenter TestingCenter) {
        this.testingCenter = TestingCenter;
    }
   
    
    public void deleteTestingCenter(String username){
        for(int i=0;i<TestingCenterList.size();i++){
            if(TestingCenterList.get(i).getUserName().equals(username)){
                TestingCenterList.remove(i);
            }
        }
    }
    
    
}
