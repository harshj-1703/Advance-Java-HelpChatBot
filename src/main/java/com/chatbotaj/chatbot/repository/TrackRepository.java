package com.chatbotaj.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.chatbotaj.chatbot.models.TrackInformations;

public interface TrackRepository extends JpaRepository<TrackInformations, Integer> {

    TrackInformations findByTrackId(@Param("trackId") String trackId);
}
