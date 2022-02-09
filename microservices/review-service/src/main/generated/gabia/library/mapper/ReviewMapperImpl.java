package gabia.library.mapper;

import gabia.library.domain.Review;
import gabia.library.dto.ReviewRequestDto.Post;
import gabia.library.dto.ReviewResponseDto.Add;
import gabia.library.dto.ReviewResponseDto.Add.AddBuilder;
import gabia.library.dto.ReviewResponseDto.Details;
import gabia.library.dto.ReviewResponseDto.Details.DetailsBuilder;
import gabia.library.dto.ReviewResponseDto.Normal;
import gabia.library.dto.ReviewResponseDto.Normal.NormalBuilder;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-09T16:02:29+0900",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_322 (Amazon.com Inc.)"
)
public class ReviewMapperImpl implements ReviewMapper {

    @Override
    public Normal reviewToReviewResponseDto(Review review) {
        if ( review == null ) {
            return null;
        }

        NormalBuilder normal = Normal.builder();

        normal.identifier( review.getIdentifier() );
        normal.createdDate( review.getCreatedDate() );
        normal.rating( review.getRating() );
        normal.modifiedDate( review.getModifiedDate() );
        normal.id( review.getId() );
        normal.title( review.getTitle() );
        normal.bookId( review.getBookId() );

        return normal.build();
    }

    @Override
    public Details reviewToReviewDetailsResponseDto(Review review) {
        if ( review == null ) {
            return null;
        }

        DetailsBuilder details = Details.builder();

        details.identifier( review.getIdentifier() );
        details.createdDate( review.getCreatedDate() );
        details.rating( review.getRating() );
        details.modifiedDate( review.getModifiedDate() );
        details.id( review.getId() );
        details.title( review.getTitle() );
        details.content( review.getContent() );
        details.bookId( review.getBookId() );

        return details.build();
    }

    @Override
    public Add reviewRequestDtoToResponseDto(Post reviewRequestDto) {
        if ( reviewRequestDto == null ) {
            return null;
        }

        AddBuilder add = Add.builder();

        add.rating( reviewRequestDto.getRating() );
        add.title( reviewRequestDto.getTitle() );
        add.content( reviewRequestDto.getContent() );

        return add.build();
    }
}
