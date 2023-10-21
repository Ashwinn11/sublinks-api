package com.sublinks.sublinksapi.api.lemmy.v3.models.views;

import com.sublinks.sublinksapi.api.lemmy.v3.enums.SubscribedType;
import com.sublinks.sublinksapi.api.lemmy.v3.models.Comment;
import com.sublinks.sublinksapi.api.lemmy.v3.models.Community;
import com.sublinks.sublinksapi.api.lemmy.v3.models.Person;
import com.sublinks.sublinksapi.api.lemmy.v3.models.Post;
import com.sublinks.sublinksapi.api.lemmy.v3.models.aggregates.CommentAggregates;
import lombok.Builder;

@Builder
public record CommentView(
        Comment comment,
        Person creator,
        Post post,
        Community community,
        CommentAggregates counts,
        boolean creator_banned_from_community,
        SubscribedType subscribed,
        boolean saved,
        boolean creator_blocked,
        int my_vote
) {
}