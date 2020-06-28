package com.company.service;

import com.company.model.CorvidForm;
import com.company.repository.CorvidFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CovidFormService {

    private CorvidFormRepository corvidFormRepository;

    @Autowired
    public CovidFormService(CorvidFormRepository
                                    corvidFormRepository) {
        this.corvidFormRepository = corvidFormRepository;
    }

    public void saveCorvidForm(CorvidForm corvidForm) {
        corvidFormRepository.save(corvidForm);
    }

    public  List<CorvidForm> checkCorvidFormExists(String personalCode) {
        List<CorvidForm> corvidForm
                = corvidFormRepository.findByPersonalCode(personalCode);

       return corvidForm;
    }
}
