package com.amit.service;

import com.amit.entity.Ticket;
import com.amit.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;
    @Override
    public Iterable<Ticket> listTickets() {
        return ticketRepository.findAll();
    }
}
