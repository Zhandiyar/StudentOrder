package edu.javacourse.studentOrder.domain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AnswerCityRegister<item> {
private List<AnswerCityRegisterItem> items;

public void addItem(AnswerCityRegisterItem item){
    if(items==null){
        items = new ArrayList<>(10);
    }items.add(item);
}
    public List<AnswerCityRegisterItem> getItems() {
        return items;
    }
}
