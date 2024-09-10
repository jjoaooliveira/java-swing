package com.mycompany.poobd.Controller;

import java.util.List;
import java.util.Optional;

public record Response(String message, Optional<List<String[]>> list) {}
