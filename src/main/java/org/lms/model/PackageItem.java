package org.lms.model;

public class PackageItem {

    String packageItemId;
    int size;
    String name;
    String description;
    Double cost;

    public PackageItem(String packageItemId,
                       int size,
                       String name,
                       String description,
                       Double cost){
        this.packageItemId = packageItemId;
        this.size = size;
        this.name = name;
        this.description= description;
        this.cost = cost;
    }

    public String getPackageItemId(){
        return packageItemId;
    }

    public int getSize(){
        return size;
    }
}
