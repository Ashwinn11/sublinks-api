package com.sublinksapp.sublinksappapi.api.lemmy.v3.models.responses;

import com.sublinksapp.sublinksappapi.api.lemmy.v3.models.views.CommentReportView;
import lombok.Builder;

import java.util.List;

@Builder
public record ListCommentReportsResponse(
        List<CommentReportView> comment_reports
) {
}