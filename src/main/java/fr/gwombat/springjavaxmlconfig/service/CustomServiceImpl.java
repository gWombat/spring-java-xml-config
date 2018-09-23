package fr.gwombat.springjavaxmlconfig.service;

/**
 * Created by guillaume.
 *
 * @since 15/09/2018
 */
public class CustomServiceImpl implements CustomService {

    private String value;


    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
