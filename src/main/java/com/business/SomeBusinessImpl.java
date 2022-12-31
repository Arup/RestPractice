package com.business;

public class SomeBusinessImpl {

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    private SomeDataService someDataService;
    public int calculateSum(){
        int[] data = someDataService.retrieveAllData();
        int sum=0;
        for(int val:data){
            sum+=val;
        }
        return sum;
    }
}
