package pl.baadamczyk.votablegal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//TOOD: Setup sonar
//TODO: Add badges
//TODO: https://apidocs.imgur.com/?version=latest#c85c9dfc-7487-4de2-9ecd-66f727cf3139
//TODO: On main page promote images with least votes
//TODO: Create page where all images can be seen
//TODO: Easy reset (with links to previous votings)
//TODO: Voting stored as set of links to images, number of likes
//TODO: Upload/download files to/from imgur
//TODO: Upload contraints: minimal resolution, minimal size, correct aspect ratio (2:1 - width > height)
//TODO: Use dedicated gallery..?
//TODO: 'Finalize' functionality - select most popular image, resize and apply the mask. Download or copy then.
//TODO: For mask - add option to specify where logo/mask will be visible (upper-left, mid-left, lower-left, upper-center, center, lower-center, upper-right, mid-right, lower-right
//TODO: Maybe just custom drag-and-drop mask positioning would be better? https://vaadin.com/docs/v14/flow/dnd/drag-source.html
//TODO: Mask preview
//TODO: Switchable auto-refresh (on by default)
//TODO: Performance tests with gatling
/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
