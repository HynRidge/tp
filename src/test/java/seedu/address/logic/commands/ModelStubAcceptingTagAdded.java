package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.ArrayList;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.tag.Tag;

/**
 * A Model stub that always accept the tag being added.
 */
@Deprecated
class ModelStubAcceptingTagAdded extends ModelStub {
    final ArrayList<Tag> tagsAdded = new ArrayList<>();

    @Override
    public boolean hasTag(Tag tag) {
        requireNonNull(tag);
        return tagsAdded.stream().anyMatch(tag::isSameTag);
    }

    @Override
    public void addTag(Tag tag) {
        requireNonNull(tag);
        tagsAdded.add(tag);
    }

    @Override
    public ReadOnlyAddressBook getAddressBook() {
        return new AddressBook();
    }
}
