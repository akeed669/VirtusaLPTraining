package com.akeed.microservices.krishtutorial;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "lang")
public class LanguageEndpoint {

    Map<String, Language> languages = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, Language> getLanguages() {
        return languages;
    }

    @ReadOperation
    public Language getLanguage(@Selector String languageKey) {

        return languages.get(languageKey);

    }

    @WriteOperation
    public void addLanguage(@Selector String languageKey,String language){
        languages.put(languageKey,new Language(language));
    }


    static class Language {
        @GeneratedValue
        int id;
        String language;

        public Language(String language) {
            this.language=language;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
