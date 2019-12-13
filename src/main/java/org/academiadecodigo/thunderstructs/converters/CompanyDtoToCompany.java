package org.academiadecodigo.thunderstructs.converters;

import org.academiadecodigo.thunderstructs.dto.CompanyDTO;
import org.academiadecodigo.thunderstructs.model.CompanyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class CompanyDtoToCompany {


    private ReviewDtoToReview toReview;

    @Autowired
    public void setToReview(ReviewDtoToReview toReview) {
        this.toReview = toReview;
    }

    public CompanyModel convert(CompanyDTO dto){
        CompanyModel model = new CompanyModel();
        model.setName(dto.getName());
        model.setReviews(dto.getReviews());
        model.setRating( dto.getRating() );
        model.setDays( dto.getDays() );
        return model;
    }

    public List<CompanyModel> converList(List<CompanyDTO> companyDTOS){
        List<CompanyModel> companyModels = new LinkedList<>(  );
        for ( CompanyDTO dto :
                companyDTOS ) {
            companyModels.add( convert( dto ) );
        }
        return companyModels;
    }

}
