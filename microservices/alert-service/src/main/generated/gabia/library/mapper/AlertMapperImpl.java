package gabia.library.mapper;

import gabia.library.domain.Alert;
import gabia.library.dto.AlertResponseDto.Details;
import gabia.library.dto.AlertResponseDto.Details.DetailsBuilder;
import gabia.library.dto.AlertResponseDto.Normal;
import gabia.library.dto.AlertResponseDto.Normal.NormalBuilder;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-09T16:03:07+0900",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_322 (Amazon.com Inc.)"
)
public class AlertMapperImpl implements AlertMapper {

    @Override
    public Normal alertToAlertNormalResponseDto(Alert alert) {
        if ( alert == null ) {
            return null;
        }

        NormalBuilder normal = Normal.builder();

        normal.identifier( alert.getIdentifier() );
        normal.alertType( alert.getAlertType() );
        normal.createdDate( alert.getCreatedDate() );
        normal.modifiedDate( alert.getModifiedDate() );
        normal.id( alert.getId() );
        normal.title( alert.getTitle() );
        normal.email( alert.getEmail() );

        return normal.build();
    }

    @Override
    public Details alertToAlertDetailsResponseDto(Alert alert) {
        if ( alert == null ) {
            return null;
        }

        DetailsBuilder details = Details.builder();

        details.identifier( alert.getIdentifier() );
        details.alertType( alert.getAlertType() );
        details.createdDate( alert.getCreatedDate() );
        details.modifiedDate( alert.getModifiedDate() );
        details.id( alert.getId() );
        details.title( alert.getTitle() );
        details.message( alert.getMessage() );
        details.email( alert.getEmail() );

        return details.build();
    }
}
