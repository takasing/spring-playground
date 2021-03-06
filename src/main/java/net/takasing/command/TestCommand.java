package net.takasing.command;

import lombok.Data;
import net.takasing.model.Attribute;
import net.takasing.model.User;

/**
 * @author takasing
 */
@Data
public class TestCommand {
    private String name;
    private User user;
    private Attribute attribute;
}
