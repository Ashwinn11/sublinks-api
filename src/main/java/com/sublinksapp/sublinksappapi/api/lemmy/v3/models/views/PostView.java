package com.sublinksapp.sublinksappapi.api.lemmy.v3.models.views;

import com.sublinksapp.sublinksappapi.api.lemmy.v3.enums.SubscribedType;
import com.sublinksapp.sublinksappapi.api.lemmy.v3.models.Community;
import com.sublinksapp.sublinksappapi.api.lemmy.v3.models.Person;
import com.sublinksapp.sublinksappapi.api.lemmy.v3.models.Post;
import com.sublinksapp.sublinksappapi.api.lemmy.v3.models.aggregates.PostAggregates;
import lombok.Builder;

@Builder
public record PostView(
        Post post,
        Person creator,
        Community community,
        boolean creator_banned_from_community,
        PostAggregates counts,
        SubscribedType subscribed,
        boolean saved,
        boolean read,
        boolean creator_blocked,
        int my_vote,
        int unread_comments
) {
}