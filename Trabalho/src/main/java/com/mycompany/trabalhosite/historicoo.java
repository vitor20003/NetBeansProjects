
package com.mycompany.trabalhosite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class historicoo {

    private List<String> historico;

    public historicoo() {
        historico = new ArrayList<>();
    }

    public void addPage(String page) {
        historico.add(page);
    }

    public List<String> getHistoricoo() {
        return historico;
    }
}
