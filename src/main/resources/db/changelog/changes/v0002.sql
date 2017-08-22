alter table exam
  add column created_at timestamp without time zone not null default now(),
  add column edited_at timestamp without time zone not null default now(),
  add column published boolean not null default false;