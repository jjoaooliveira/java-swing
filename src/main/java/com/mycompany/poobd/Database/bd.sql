CREATE TABLE IF NOT EXISTS carro
(
    id serial PRIMARY KEY,
    cor character varying(20),
    modelo character varying(40),
    ano character varying(4)
)