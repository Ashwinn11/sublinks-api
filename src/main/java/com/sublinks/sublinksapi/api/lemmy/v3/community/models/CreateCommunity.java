package com.sublinks.sublinksapi.api.lemmy.v3.community.models;

import java.util.Collection;
import lombok.Builder;

@Builder
public record CreateCommunity(
    String name,
    String title,
    String description,
    String icon,
    String banner,
    Boolean nsfw,
    Boolean posting_restricted_to_mods,
    Collection<String> discussion_languages
) {

}