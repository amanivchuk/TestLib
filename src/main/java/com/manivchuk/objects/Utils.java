package com.manivchuk.objects;

import com.manivchuk.enums.SearchType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.faces.context.FacesContext;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by nec on 06.11.17.
 */
@Component
public class Utils {

    private Map<String, SearchType> searchTypeList = new HashMap<>();
    private SearchType selectedSearchType = SearchType.TITLE; // Значение по умолчанию

    @Autowired
    private MessageSource msg;

    private Character[] letters = new Character[]{'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};

    public Character[] getLetters() {
        return letters;
    }

    public Map<String, SearchType> getSearchTypeList(){
        searchTypeList.clear();
        searchTypeList.put(msg.getMessage("author_name", null, FacesContext.getCurrentInstance().getViewRoot().getLocale()), SearchType.AUTHOR);
        searchTypeList.put(msg.getMessage("book_name", null, FacesContext.getCurrentInstance().getViewRoot().getLocale()), SearchType.TITLE);
        return searchTypeList;
    }

    public SearchType getSelectedSearchType(){
        return selectedSearchType;
    }
    public void setSearchTypeList(Map<String, SearchType> searchTypeList){
        this.searchTypeList = searchTypeList;
    }
}
